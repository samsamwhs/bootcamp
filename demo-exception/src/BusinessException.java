//! if a class extending Exception/ RuntimeException, you can "throw" this exception object
//! if a class extending Exception, compiler must handle the exception error -> try & catch,
//! Exception is safer but too many try & catch will be too clumsy 


//!Checked exception -> a class extends Exception
//!Unchecked exception -> a class extends RuntimeException
public class BusinessException extends RuntimeException {
  
  //there can be attribute in child exception class
  //code + message
  // 1. 47893 -> Customer Not Found
  private int code;

  public BusinessException(SysError sysError){ //<- public BusinessException(String message){  
    super(sysError.getMessage());//there is attribute "message" and method "getMessage" in parent class RuntimeException 
  }

  public static void main(String[] args) {
    throw new BusinessException(SysError.CUSTOMER_NOT_FOUND); //write exception class by myself, e.g. fund transfer over pre-set limit


  }

}
