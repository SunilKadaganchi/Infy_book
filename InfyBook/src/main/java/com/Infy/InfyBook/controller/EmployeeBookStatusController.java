package com.Infy.InfyBook.controller;

public class EmployeeBookStatusController {

    /**
     *  - Add the Book to Reserved -> reduce the book available count
     *
     *  - If book Available count==0 , then only notify me should be activated
     *
     *  - Change the Reserved Book status
     *      -> Released = at the same time send the notifications,
     *                      -> if released update the Book available count.
     *                      -> if released send notifications to notify me users.
     *      -> Collected = at the same time send the notifications
     *
     *  - Update the Status of Collected book to Renewed if Renewed
     *  - Update the Status from Collected to Returned ,
     *          ->  at the same time Calculate the Penalty if Due date is Crossed
     *               Only ADMIN can perform this Action
     *          -> at the same time send notifications to who opted for Notify me about that Book
     *          ( try to store the data of book and notify opted users in separate table or think to optimise)
     *
     *
     * */
}
