/*
 * This file is generated by jOOQ.
*/
package com.test.restapi.routines;


import com.test.restapi.Restapitest;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InsertUser extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -2097123869;

    /**
     * The parameter <code>restapitest.insert_user.first_name</code>.
     */
    public static final Parameter<String> FIRST_NAME = createParameter("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(20), false, false);

    /**
     * The parameter <code>restapitest.insert_user.last_name</code>.
     */
    public static final Parameter<String> LAST_NAME = createParameter("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(20), false, false);

    /**
     * The parameter <code>restapitest.insert_user.date_of_birth</code>.
     */
    public static final Parameter<Date> DATE_OF_BIRTH = createParameter("date_of_birth", org.jooq.impl.SQLDataType.DATE, false, false);

    /**
     * The parameter <code>restapitest.insert_user.street_address</code>.
     */
    public static final Parameter<String> STREET_ADDRESS = createParameter("street_address", org.jooq.impl.SQLDataType.VARCHAR.length(40), false, false);

    /**
     * The parameter <code>restapitest.insert_user.city</code>.
     */
    public static final Parameter<String> CITY = createParameter("city", org.jooq.impl.SQLDataType.VARCHAR.length(40), false, false);

    /**
     * The parameter <code>restapitest.insert_user.province</code>.
     */
    public static final Parameter<String> PROVINCE = createParameter("province", org.jooq.impl.SQLDataType.VARCHAR.length(40), false, false);

    /**
     * The parameter <code>restapitest.insert_user.telephone</code>.
     */
    public static final Parameter<String> TELEPHONE = createParameter("telephone", org.jooq.impl.SQLDataType.VARCHAR.length(12), false, false);

    /**
     * The parameter <code>restapitest.insert_user.email</code>.
     */
    public static final Parameter<String> EMAIL = createParameter("email", org.jooq.impl.SQLDataType.VARCHAR.length(100), false, false);

    /**
     * Create a new routine call instance
     */
    public InsertUser() {
        super("insert_user", Restapitest.RESTAPITEST);

        addInParameter(FIRST_NAME);
        addInParameter(LAST_NAME);
        addInParameter(DATE_OF_BIRTH);
        addInParameter(STREET_ADDRESS);
        addInParameter(CITY);
        addInParameter(PROVINCE);
        addInParameter(TELEPHONE);
        addInParameter(EMAIL);
    }

    /**
     * Set the <code>first_name</code> parameter IN value to the routine
     */
    public void setFirstName(String value) {
        setValue(FIRST_NAME, value);
    }

    /**
     * Set the <code>last_name</code> parameter IN value to the routine
     */
    public void setLastName(String value) {
        setValue(LAST_NAME, value);
    }

    /**
     * Set the <code>date_of_birth</code> parameter IN value to the routine
     */
    public void setDateOfBirth(Date value) {
        setValue(DATE_OF_BIRTH, value);
    }

    /**
     * Set the <code>street_address</code> parameter IN value to the routine
     */
    public void setStreetAddress(String value) {
        setValue(STREET_ADDRESS, value);
    }

    /**
     * Set the <code>city</code> parameter IN value to the routine
     */
    public void setCity(String value) {
        setValue(CITY, value);
    }

    /**
     * Set the <code>province</code> parameter IN value to the routine
     */
    public void setProvince(String value) {
        setValue(PROVINCE, value);
    }

    /**
     * Set the <code>telephone</code> parameter IN value to the routine
     */
    public void setTelephone(String value) {
        setValue(TELEPHONE, value);
    }

    /**
     * Set the <code>email</code> parameter IN value to the routine
     */
    public void setEmail(String value) {
        setValue(EMAIL, value);
    }
}
