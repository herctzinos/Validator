/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validators;

import Songs.Mp3;
import org.springframework.stereotype.Repository;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Repository
public class MusicValidator implements Validator {

    @Override
    public boolean supports(Class type) {
        return Mp3.class.equals(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Mp3 mp3 = (Mp3) o;

        if (mp3.getTitle().trim().length() < 7) {
            errors.rejectValue("title", "password.less7");
        }

    }

}
