import java.util.HashMap;

public class DB {

    public static void main(String[] args) {

    }

    public <T> HashMap<String, T> getAll(Class<T> tClass) throws IllegalAccessException, InstantiationException {

        T t = tClass.newInstance();
        HashMap<String, T> entities = new HashMap<>();

        return entities;
    }
}

class SQL {

    public SQL select() {

        return this;
    }

    public SQL field(String field) {
        return this;
    }

    public SQL from(String table) {
        return this;
    }

    public SQL join(String table, String alias, String condition) {
        return this;
    }

    public SQL into(String cursorname) {

        return this;
    }
}

class Cursor<K, T> extends HashMap {

}

class DataSession {

    HashMap<String, Cursor> cursors = new HashMap<>();
    public Cursor addCursor(String name, Cursor cursor) {
        cursors.put(name, cursor);
        return cursor;
    }



}

class Emp {
    public Integer empid;
    public String empname;

}

class Job {

    public Integer jobid;
    public HashMap<String, Emp> emps;


}