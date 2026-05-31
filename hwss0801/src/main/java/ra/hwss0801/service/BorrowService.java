package ra.hwss0801.service;

import ra.hwss0801.model.dto.request.BorrowCreateDTO;
import ra.hwss0801.model.entity.Borrow;

public interface BorrowService {
    Borrow createBorrow(BorrowCreateDTO borrowCreateDTO);
}
