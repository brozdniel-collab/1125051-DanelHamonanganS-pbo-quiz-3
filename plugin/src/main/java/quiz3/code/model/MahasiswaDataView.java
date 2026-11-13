package quiz3.code.model;

abstract class MahasiswaDataView extends DataView<Mahasiswa> {

    @Override
    protected String getPrimaryKeyValue(Mahasiswa data) {
        return data.getNim();
    }

    @Override
    protected String[] getFields() {
        
    }
    
    
}
