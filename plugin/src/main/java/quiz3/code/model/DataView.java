package quiz3.code.model;

import java.util.ArrayList;
import java.util.List;

import quiz3.code.util.CLIUtil;

abstract class DataView<T> {
    private List<T> records = new ArrayList<>();

    public void printAll(){
        String[] fields = this.getFields();
        for(int i = 0 ; i < this.records.size() ; i++){
            T record = this.records.get(i);
            String[] values = this.convertModelToValues(record);
            System.out.print(i+". ");
            for(int  j = 0 ; j < fields.length;j++){
                System.out.print(fields[j]+"="+values[j]+", ");
            }
        }
    }
    
    public void printByPk(String primarykey){
        String[] fields = this.getFields();
        for (int i = 0; i < this.records.size(); i++) {
            T data = this.records.get(i);
            if (this.getPrimaryKeyValue(data).equals(primarykey)) {
                String[] values = this.convertModelToValues(data);
                for (int j = 0; j < fields.length; j++) {
                    System.out.println(fields[j] + ": " + values[j]);
                }
                return;
            }
        }
        System.out.println("Data with primary key '" + primarykey + "' was not found.");
    }
    public void showInsertForm(){
        String[] fields = this.getFields();
        String[] values = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]+" ");
            String value = CLIUtil.readString("Masukan Data : ");
        }
        T record = this.convertValuesToModel(values);
        this.records.add(record);
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
