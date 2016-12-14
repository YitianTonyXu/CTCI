package com.ctci;

public class MainClass {

    public static void main(String[] arg){
//        TestChapter1();
        TestChapter2();
    }

    public static void TestChapter1() {
        Chapter1.testIsUnique();
        Chapter1.testIsPermutation();
        Chapter1.testReplaceSpaces();
        Chapter1.testIsPalindromePermutation();
        Chapter1.testIsOneAway();
        Chapter1.testStringCompression();
        Chapter1.testRotateImage();
        System.out.println();
        Chapter1.testZeroMatrix();
        Chapter1.testIsRotation();

        System.out.println("Chapter 1 testing complete!! HEN HAO, YI BAI FEN!");
    }

    public static void TestChapter2(){
        Chapter2.testRemoveDupes();
        Chapter2.testKthToLast();
        Chapter2.testDeleteMiddleNode();
        Chapter2.testPartitionLinkedList();
        Chapter2.testReverseLinkedList();
        Chapter2.testSumLists();
        Chapter2.testIsPalindrome();
        Chapter2.testDoesIntersect();
        Chapter2.testFindCircularLinkedListStart();
    }
}
