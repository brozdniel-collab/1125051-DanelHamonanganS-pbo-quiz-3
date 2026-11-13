package quiz3.code.model;

import java.util.ArrayList;
import java.util.List;

abstract class DataView<T> {
    private List<T> records = new ArrayList<>();

    public void printAll(){
        String[] fields = this.getFields();
        for(int i = 0 ; i < this.records.size() ; i++){
            T record = this.records.get(i);
            String[] values = this.convertModelToValues(records.get(i));
            System.out.print(i+". ");
            for(int  j = 0 ; j < fields.length;j++){
                System.out.print(fields[j]+"="+values[j]+", ");
            }
        }
    }
    
    public void printByPk(String primarykey){
        
    }
    public void showInsertForm(){
    }
        
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
