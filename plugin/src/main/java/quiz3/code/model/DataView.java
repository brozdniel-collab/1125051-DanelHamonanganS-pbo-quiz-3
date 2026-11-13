package quiz3.code.model;

import java.util.ArrayList;
import java.util.List;

abstract class DataView<T> {
    private List<T> data = new ArrayList<>();

    public void printAll(boolean withUnitPrice){
        String[] fields = this.getFields();


        String[] values = this.convertModelToValues(record);
        System.out.print(i+". ");
        for(int  j = 0 ; j < fields.length;j++){
            System.out.print();
        }
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
