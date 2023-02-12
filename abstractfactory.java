import java.util.Scanner;

//firs created an interface which is equal to all languages
interface language {
  public void book(); // booking a book

  public void book_author(); // author of the book

  public void book_type(); // book type like bigineer anr expert

  public void book_cost(); // cost of the book
}

abstract class python implements language {
  String book_type;
  String book_author;
  int book_cost;

  public void book() {
    book_author();
    book_type();
    book_cost();
    System.out
        .println("you have booked a " + book_type + " by " + book_author + " and the cost is  " + book_cost + " . ");
  }
}

class beginner_python extends python {
  public beginner_python() {
  };

  public void book_type() {
    book_type = "beginner python";
  }

  public void book_author() {
    book_author = "Eric Matthes";

  }

  public void book_cost() {
    book_cost = 499;
  }
}

class expert_python extends python {
  public expert_python() {
  };

  public void book_type() {
    book_type = "expert python";
  }

  public void book_author() {
    book_author = "Luciano Ramalho";

  }

  public void book_cost() {
    book_cost = 999;
  }
}

abstract class java implements language {
  String book_type;
  String book_author;
  int book_cost;

  public void book() {
    book_author();
    book_type();
    book_cost();
    System.out
        .println("you have booked a " + book_type + " by " + book_author + " and the cost is  " + book_cost + " . ");
  }
}

class beginner_java extends python {
  public beginner_java() {
  };

  public void book_type() {
    book_type = "beginner java";
  }

  public void book_author() {
    book_author = "Kathy Sierra & Bert Bates";

  }

  public void book_cost() {
    book_cost = 4990;
  }
}

class expert_java extends python {
  public expert_java() {
  };

  public void book_type() {
    book_type = "expert java";
  }

  public void book_author() {
    book_author = "Raoul-Gabriel Urma ";

  }

  public void book_cost() {
    book_cost = 999;
  }
}

abstract class cpp implements language {
  String book_type;
  String book_author;
  int book_cost;

  public void book() {
    book_author();
    book_type();
    book_cost();
    System.out
        .println("you have booked a " + book_type + " by " + book_author + " and the cost is  " + book_cost + " . ");
  }
}

class beginner_cpp extends python {
  public beginner_cpp() {
  };

  public void book_type() {
    book_type = "beginner cpp";
  }

  public void book_author() {
    book_author = "Bjarne Stroustrup";

  }

  public void book_cost() {
    book_cost = 499;
  }
}

class expert_cpp extends python {
  public expert_cpp() {
  };

  public void book_type() {
    book_type = "expert cpp";
  }

  public void book_author() {
    book_author = "Vardan Grigoryan";

  }

  public void book_cost() {
    book_cost = 2502;
  }
}

abstract class abstract_lang_factory {
  public abstract language getLanguage(String type);
}

class pythonFactory extends abstract_lang_factory {
  public language getLanguage(String type) {
    if (type.equalsIgnoreCase("biginneer")) {
      return new beginner_python();
    } else if (type.equalsIgnoreCase("expert")) {
      return new expert_python();
    } else {
      return new beginner_python();
    }
  }
}

class javaFactory extends abstract_lang_factory {
  public language getLanguage(String type) {
    if (type.equalsIgnoreCase("biginneer")) {
      return new beginner_java();
    } else if (type.equalsIgnoreCase("expert")) {
      return new expert_java();
    } else {
      return new beginner_java();
    }
  }
}

class cppFactory extends abstract_lang_factory {
  public language getLanguage(String type) {
    if (type.equalsIgnoreCase("biginneer")) {
      return new beginner_cpp();
    } else if (type.equalsIgnoreCase("expert")) {
      return new expert_cpp();
    } else {
      return new beginner_cpp();
    }
  }
}

class FactoryProvider {
  public static abstract_lang_factory getLanguageFactory(String book_type) {
    if (book_type.equalsIgnoreCase("python")) {
      return new pythonFactory();
    } else if (book_type.equalsIgnoreCase("java")) {
      return new javaFactory();
    }
    if (book_type.equalsIgnoreCase("cpp")) {
      return new cppFactory();
    } else {
      return new pythonFactory();
    }
  }
}

public class abstractfactory {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter book name");
    String book_type = sc.nextLine();
    System.out.println("enter level of the book");
    String type = sc.nextLine();

    abstract_lang_factory obj = FactoryProvider.getLanguageFactory(book_type);
    language bookingObj = obj.getLanguage(type);
    bookingObj.book();
    sc.close();

  }
}