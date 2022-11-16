package com.foysal.practice.hrm


class ExceptionDetails {
    companion object {
        private val exceptionList = ArrayList<Exception>()
        fun setException(
            name: String,
            id: String,
            date: String,
            dateType: String,
            xReason: String
        ) {
            val exception = Exception(
                name, id, date, dateType, xReason
            )
            exceptionList.add(exception)
        }

        fun getException(): ArrayList<Exception> {
            return exceptionList
        }
    }

}