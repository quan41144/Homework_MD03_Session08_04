package ra.hwss0801.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.hwss0801.model.dto.request.BorrowCreateDTO;
import ra.hwss0801.model.entity.Borrow;
import ra.hwss0801.repository.BorrowRepository;

@RestController
@RequestMapping("/api/borrows")
@RequiredArgsConstructor
public class BorrowController {
    private final BorrowRepository borrowRepository;
    @PostMapping
    public ResponseEntity<Borrow> createBorrow(@Valid @RequestBody BorrowCreateDTO borrowCreateDTO) {
        Borrow borrow = Borrow.builder()
                .username(borrowCreateDTO.getUsername())
                .bookId(borrowCreateDTO.getBookId())
                .build();
        return new ResponseEntity<>(borrowRepository.save(borrow), HttpStatus.CREATED);
    }
}
