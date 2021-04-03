/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev2;

/**
 *
 * @author melikekecelioglu
 */
public class Person {

    public String mail;
    public String nameSurname;
    public String password;
    public String phone;
    public char gender;
    public boolean isSmoker;
    public static int PersonId;
    public int id;

    public Person() {
        this.id = Person.PersonId;
        Person.PersonId++;

    }

}
