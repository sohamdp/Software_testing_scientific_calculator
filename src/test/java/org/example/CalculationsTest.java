package org.example;

import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest
{

    Calculations calculations=new Calculations();

    @Test
    void add()
    {
        assertEquals(2,calculations.add(1,1));
        //assertNotEquals(7,calculations.add(1,2));
    }

    @Test
    void subtract()
    {
        assertEquals(4,calculations.subtract(7,3));
        //assertNotEquals(-2,calculations.subtract(1,2));
    }

    @Test
    void divide()
    {
        assertEquals(4,calculations.divide(16,4));
        //assertNotEquals(17,calculations.divide(25,5));
    }

    @Test
    void modulo()
    {
        assertEquals(2,calculations.modulo(37,5));
       // assertNotEquals(0,calculations.modulo(25,4));
    }

    @Test
    void squareRoot() {
        assertEquals(4,calculations.squareRoot(16));
        //assertNotEquals(4.5,calculations.squareRoot(25));
    }

    @Test
    void multiInverse()
    {
        assertEquals(0.5,calculations.multiInverse(2));
        //assertNotEquals(2.5,calculations.multiInverse(25));
    }

    @Test
    void multiply() {
        assertEquals(400,calculations.multiply(20,20));
    }

    @Test
    void square() {
        assertEquals(961,calculations.square(31));
    }

    @Test
    void factorial()
    {
        assertEquals(24,calculations.factorial(4));
        assertEquals(1,calculations.factorial(0));
        assertEquals(1,calculations.factorial(1));
        assertEquals(0,calculations.factorial(-2));
    }

    @Test
    void combinations() {
        assertEquals(1,calculations.Combinations(0,0));
        assertEquals(0,calculations.Combinations(6,10));
        assertEquals(6,calculations.Combinations(4,2));
        assertEquals(0,calculations.Combinations(0,1));
        assertEquals(0,calculations.Combinations(-1,1));
        assertEquals(0,calculations.Combinations(1,-1));
        assertEquals(0,calculations.Combinations(-2,-3));
    }

    @Test
    void permutations() {
        assertEquals(1,calculations.Permutations(0,0));
        assertEquals(0,calculations.Permutations(6,10));
        assertEquals(12,calculations.Permutations(4,2));
        assertEquals(0,calculations.Permutations(0,1));
        assertEquals(0,calculations.Permutations(-1,1));
        assertEquals(0,calculations.Permutations(1,-1));
        assertEquals(0,calculations.Permutations(-1,-1));
    }

    @Test
    void powerFunction() {
        assertEquals(1,calculations.powerFunction(4,0));
        assertEquals(0,calculations.powerFunction(0,1));
        assertEquals(0.5,calculations.powerFunction(2,-1));
        assertEquals(16,calculations.powerFunction(-4,2));
        assertEquals(-4,calculations.powerFunction(-4,1));
        assertEquals(-0.5,calculations.powerFunction(-2,-1));
        assertEquals(0.25,calculations.powerFunction(-2,-2));
    }

    @Test
    void log() {
        assertEquals(-1,calculations.log(0));
        assertEquals(-1,calculations.log(-6));
        assertEquals(3,calculations.log(32));
    }


    @Test
    void areaOfSquare()
    {
        assertEquals(225,calculations.areaOfSquare(15));
    }

    @Test
    void areaOfRectangle()
    {
        assertEquals(49,calculations.areaOfRectangle(7,7));
    }

    @Test
    void areaOfCircle()
    {
        assertEquals(113.03999999999999,calculations.areaOfCircle(6));
    }

    @Test
    void areaOfTriangle()
    {
        assertEquals(36,calculations.areaOfTriangle(12,6));
    }

    @Test
    void surfaceAreaOfCube() {
        assertEquals(3750,calculations.surfaceAreaOfCube(25));
    }

    @Test
    void surfaceAreaOfCylinder() {
        assertEquals(571.48,calculations.surfaceAreaOfCylinder(7,6));
    }

    @Test
    void surfaceAreaOfCone() {
        assertEquals(678.24,calculations.surfaceAreaOfCone(12,6));
    }

    @Test
    void surfaceAreaOfSphere() {
        assertEquals(1808.6399999999999,calculations.surfaceAreaOfSphere(12));
    }

    @Test
    void volumeOfCube()
    {
        assertEquals(6859,calculations.volumeOfCube(19));
    }

    @Test
    void volumeOfCylinder()
    {
        assertEquals(1077.02,calculations.volumeOfCylinder(7,7));
    }

    @Test
    void volumeOfCone() {
        assertEquals(1055.0399999999997,calculations.volumeOfCone(12,7));
    }

    @Test
    void volumeOfSphere() {
        assertEquals(267.94666666666666,calculations.volumeOfSphere(4));
    }

    @Test
    void sinFunction() {
        assertEquals(0.49999999999999994,calculations.sinFunction(30));
        assertEquals(1,calculations.sinFunction(90));
    }

    @Test
    void cosFunction() {
        assertEquals(0.7071067811865476,calculations.cosFunction(45));
    }

    @Test
    void tanFunction() {
        assertEquals(0,calculations.tanFunction(180),0.000000001);
        assertThrows(IllegalArgumentException.class,()->calculations.tanFunction(90));
        //assertThrows(IllegalArgumentException.class,()->calculations.tanFunction(270));
    }

    @Test
    void arcsin()
    {
        assertEquals(90,calculations.arcsin(1));
        assertEquals(30,calculations.arcsin(0.5),0.000000001);
        assertEquals(-90,calculations.arcsin(-1));
    }

    @Test
    void arccos()
    {
        assertEquals(0,calculations.arccos(1));
        assertEquals(180,calculations.arccos(-1));

    }

    @Test
    void arctan() {
        assertEquals(45,calculations.arctan(1),0.000000001);
    }

    @Test
    void decimalToBinary()
    {
        assertEquals("111",calculations.decimalToBinary(7));
    }

    @Test
    void binaryToDecimal()
    {
        assertEquals(9,calculations.binaryToDecimal("1001"));
    }

    @Test
    void romanToInt()
    {
        assertEquals(4,calculations.romanToInt("IV"));
    }

    @Test
    void integerToRoman()
    {
        assertEquals("XIII",calculations.integerToRoman(13));
    }

    @Test
    void bitwiseOr()
    {
        assertEquals(31,calculations.bitwiseOr(23,12));
        assertEquals(1,calculations.bitwiseOr(0,1));
    }

    @Test
    void bitwiseXor()
    {
        assertEquals(15,calculations.bitwiseXor(3,12));
    }

    @Test
    void bitwiseNot()
    {
        assertEquals(-70,calculations.bitwiseNot(69));
    }

    @Test
    void leftShift()
    {
        assertEquals(68,calculations.leftShift(17,2));
    }

    @Test
    void rightShift()
    {
        assertEquals(38,calculations.rightShift(1234,5));
    }

    @Test
    void bitwiseAnd()
    {
        assertEquals(12,calculations.bitwiseAnd(13,12));
    }
}