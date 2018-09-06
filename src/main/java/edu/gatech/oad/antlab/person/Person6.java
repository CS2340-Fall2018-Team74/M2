package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string
 *
 *  @author Mai Pham (mpham33)
 *  @version 1.1
 */
public class Person6 {
    /** Holds the persons real name */
    private String name;
    /**t
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
    public Person6(String pname) {
        name = pname;
    }
    /**
     * This method should take the string
     * input and return its characters rotated
     * 2 positions.
     * given "gtg123b" it should return
     * "g123bgt".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
        //Person 5 put your implementation here
        return input.substring(2, input.length()) + input.substring(0, 2);
    }

    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the
     *         object
     */
    public String toString(String input) {
        return name + calc(input);
    }

}
