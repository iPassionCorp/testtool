package th.co.ipassion.testtool.genfiles.models;

public class Tables {
	
	private String table_schema;
	private String table_name;
	
	public String getTable_schema() {
		return table_schema;
	}
	public void setTable_schema(String table_schema) {
		this.table_schema = table_schema;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	
	@Override
	public boolean equals(Object other) {
		boolean result;
	    if((other == null) || (getClass() != other.getClass())){
	        result = false;
	    } // end if
	    else{
	    		Tables otherTables = (Tables) other;
	        result = this.table_schema.equals(otherTables.getTable_schema()) && this.table_name.equals(otherTables.getTable_name());  
	    } // end else

	    return result;
	}
	
}
