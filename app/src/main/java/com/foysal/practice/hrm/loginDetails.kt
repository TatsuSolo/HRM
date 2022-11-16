package com.foysal.practice.hrm

object LoginDetails {

    fun getLogin(): ArrayList<Login>{

        val loginList = ArrayList<Login>()

        val user1 = Login(
            "1", "1234", "Admin"
        )

        loginList.add(user1)

        val user2 = Login(
            "2", "1241", "Employee"
        )
        loginList.add(user2)
        val user3 = Login(
            "3", "1241", "Employee"
        )
        loginList.add(user3)
        val user4 = Login(
            "4", "1287", "Employee"
        )
        loginList.add(user4)

        return loginList
    }

}