/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPN;

/**
 *
 * @author Maksymilian
 */
public interface Operation {

    public Integer operationAdd(Integer operation1, Integer operation2);
    public Integer operationMinus(Integer operation1, Integer operation2);
    public Integer operationMulti(Integer operation1, Integer operation2);
    public Integer operationDiv(Integer operation1, Integer operation2);

}

