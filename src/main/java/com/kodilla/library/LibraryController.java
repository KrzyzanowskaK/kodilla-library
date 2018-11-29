package com.kodilla.library;

import com.kodilla.library.DAO.BookDao;
import com.kodilla.library.DAO.ModelDao;
import com.kodilla.library.DAO.RentalDao;
import com.kodilla.library.DAO.UserDao;
import com.kodilla.library.DTO.BookDto;
import com.kodilla.library.DTO.ModelDto;
import com.kodilla.library.DTO.RentalDto;
import com.kodilla.library.DTO.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("kodilla/library")
public class LibraryController {
    @Autowired
    UserDao userDao;
    @Autowired
    BookDao bookDao;
    @Autowired
    ModelDao modelDao;
    @Autowired
    RentalDao rentalDao;
    @Autowired
    LibraryMapper libraryMapper;

    @RequestMapping(method = RequestMethod.POST, value = "addUser", consumes = APPLICATION_JSON_VALUE)
    public void addUser(@RequestBody UserDto userDto) {
        userDao.save(libraryMapper.mapToUser(userDto));
    }

    @RequestMapping(method = RequestMethod.POST, value = "addBook", consumes = APPLICATION_JSON_VALUE)
    public void addBook(@RequestBody BookDto bookDto) {
        bookDao.save(libraryMapper.mapToBook(bookDto));
    }

    @RequestMapping(method = RequestMethod.POST, value = "addModel", consumes = APPLICATION_JSON_VALUE)
    public void addModel(@RequestBody ModelDto modelDto) {
        modelDao.save(libraryMapper.mapToModel(modelDto));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateModel", consumes = APPLICATION_JSON_VALUE)
    public ModelDto updateModel(@RequestBody ModelDto modelDto) {
        Model fetchModel = modelDao.findById(modelDto.getId()).get();
        fetchModel.setStatus(modelDto.getStatus());
        return libraryMapper.mapToModelDto(modelDao.save(fetchModel));
    }

    @RequestMapping(method = RequestMethod.GET, value = "getModel")
    public List<ModelDto> getModel(@RequestParam long bookId) {
        return libraryMapper.mapToModelList(modelDao.findModelByBookId(bookId));
    }

    @RequestMapping(method = RequestMethod.POST, value = "rentModel")
    public void rentModel(@RequestParam long userId, long modelId) {
        rentalDao.save(new Rental(userId, modelId, LocalDateTime.now(), null));
    }

    @RequestMapping(method = RequestMethod.POST, value = "returnModel")
    public RentalDto returnModel(@RequestParam long modelId) {
        Rental fetchRent = rentalDao.findById(modelId).get();
        fetchRent.setReturnDate(LocalDateTime.now());
        return libraryMapper.mapToRentalDto(rentalDao.save(fetchRent));
    }
}
