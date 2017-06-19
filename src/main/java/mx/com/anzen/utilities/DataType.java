package mx.com.anzen.utilities;


public class DataType {
	
	// Variables
	protected Integer parametroInteger = 0;
	protected Float parametroFloat = 0.0F;
	protected String parametroString = "";
	protected Byte parametroByte = 0;
	protected Short parametroShort = 0;
	protected Long parametroLong = 0L;
	protected Double parametroDouble = 0.0;
	protected Boolean parametroBoolean = false;
	protected Character parametroCharacter = ' ';

	
	// Constantes
	public final int PARAMETRO_Integer = 1,
	  					PARAMETRO_Float = 2,		
	  					PARAMETRO_String = 3,
	  					PARAMETRO_Byte = 4, 
	  					PARAMETRO_Short = 5, 
	  					PARAMETRO_Long = 6, 
	  					PARAMETRO_Double = 7, 
	  					PARAMETRO_Boolean = 8, 
	  					PARAMETRO_Character = 9,
						PARAMETRO_SQLDataTable = 10;
	
	public final String PARAMETRO_SQLDataTable_SQL = "sql",
						PARAMETRO_SQLDataTable_DataTable = "dataTable";
}
