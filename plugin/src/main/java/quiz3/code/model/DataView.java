package quiz3.code.model;

import java.util.ArrayList;
import java.util.List;

abstract class DataView<T> {
    private List<T> data = new ArrayList<>();

    public void printAll(){

    }
    public void pintByPk(String primarykey){
        
    }
    public void showInsertForm(){
        
    }
    public void showUpdateForm(){

    }
    public void promptDelete(){

    }
    protected abstract String getPrimaryKeyValue(T data);
    protected abstract String[] getFields();
    protected abstract T convertValuesToModel(String[]values);
    protected abstract String[]convertModelToValues(T data);


}
