package Day8; /**
* This is an implementation of a class
*/

public class Anonymous {
  public static void main(String[] args) {
    String code = "";
    // String code = "CODE-BLUE";
    Validator.validate(code, new Callback() {
      @Override
      public void validated(boolean v){
        System.out.println(v);
      }
      @Override
      public void failed(String msg) {
        System.out.println(msg);
      }
    });
  }
}

interface Callback {
  void validated(boolean validated);
  void failed(String message);
}

class Validator {
  public static void validate(String code, Callback callback) {
    if (code.equals("")) {
      callback.failed("Empty code!");
      callback.validated(false);
      return;
    }
    callback.validated(true);
  }
}
