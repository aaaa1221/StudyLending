package com.devglan.exception.book;

import com.devglan.exception.BusinessErrorCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
public class BookBusinessException extends RuntimeException {
  private static final long serialVersionUID = 2237164598124433306L;
  protected BusinessErrorCode businessErrorQueryCode;
  protected HttpStatus httpStatus;

  public BookBusinessException(String message, BusinessErrorCode businessErrorQueryCode,
      HttpStatus httpStatus) {
    super(message);
    this.businessErrorQueryCode = businessErrorQueryCode;
    this.httpStatus = httpStatus;
  }

  public BookBusinessException(String message) {
    super(message);
    this.businessErrorQueryCode = BusinessErrorCode.BookNotFound;
    this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
  }
}
