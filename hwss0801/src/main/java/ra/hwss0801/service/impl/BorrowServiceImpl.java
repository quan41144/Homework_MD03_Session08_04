package ra.hwss0801.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ra.hwss0801.model.dto.request.BorrowCreateDTO;
import ra.hwss0801.model.entity.Borrow;
import ra.hwss0801.repository.BorrowRepository;
import ra.hwss0801.service.BorrowService;
@Service
@RequiredArgsConstructor
public class BorrowServiceImpl implements BorrowService {
    private final BorrowRepository borrowRepository;
    @Override
    public Borrow createBorrow(BorrowCreateDTO borrowCreateDTO) {
        Borrow borrow = Borrow.builder()
                .username(borrowCreateDTO.getUsername())
                .bookId(borrowCreateDTO.getBookId())
                .build();
        return borrowRepository.save(borrow);
    }
}
