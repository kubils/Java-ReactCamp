package kodlamaio.northwind.core.utilities.results;

import lombok.Data;

//usage multiple data with generics
public class DataResult<T> extends Result{

    private T data;

    public DataResult(T data, boolean success, String message) {
        super(success, message); //base constructor
        this.data = data;
    }

    public DataResult(T data, boolean success) {
        super(success);
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
