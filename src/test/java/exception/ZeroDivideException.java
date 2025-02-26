package exception;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public class ZeroDivideException extends RuntimeExceptionf {

    public ZeroDivideException() {
        super ("Ошибка деление на ноль");
    }
}


