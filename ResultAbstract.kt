sealed class Result {
    class InternetError : Result() {
        override val a: Int = 0
        override fun message(): String {
            return "Connection Error"
        }
    }

    class ServerError(val code: Int) : Result() {
        override val a: Int = 1
        override fun message(): String {
            return "502 Error"
        }
    }

    class QueryError(val message: String) : Result() {
        override val a: Int = 2
        override fun message(): String {
            return "Query Error!"
        }
    }

    class Data(val list: List<Student>) : Result() {
        override val a: Int = 3
        override fun message(): String {
            return "Success"
        }
    }

    abstract val a: Int
    abstract fun message(): String
}
