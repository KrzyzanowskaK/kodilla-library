package com.kodilla.library;

import com.kodilla.library.DTO.BookDto;
import com.kodilla.library.DTO.ModelDto;
import com.kodilla.library.DTO.RentalDto;
import com.kodilla.library.DTO.UserDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LibraryMapper {

    public User mapToUser (final UserDto userDto){
        return new User(userDto.getName(), userDto.getSurname());
    }

    public UserDto mapToUserDto (final User user) {
        return new UserDto(user.getName(), user.getSurname());
    }

    public Book mapToBook(final BookDto bookDto) {
        return new Book(bookDto.getTitle(), bookDto.getAuthor(), bookDto.getPublicationYear());
    }

    public Model mapToModel(final ModelDto modelDto) {
        return new Model(modelDto.getBookId());
    }

    public ModelDto mapToModelDto(final Model model) {
        return new ModelDto(model.getId(), model.getBookId(), model.getStatus());
    }

    public List<ModelDto> mapToModelList(final List<Model> modelList) {
        return modelList.stream().map(e -> new ModelDto(e.getId(), e.getBookId(), e.getStatus())).collect(Collectors.toList());
    }

    public RentalDto mapToRentalDto(final Rental rent) {
        return new RentalDto(rent.getUserId(), rent.getModelId(), rent.getRentDate(), rent.getReturnDate());
    }
}
