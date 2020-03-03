data class Student(val name: String)

sealed class Result {
    class InternetError
    class ServerError(code: Int)
    class QueryError(message: String)
    class Data(list: List<Student>)
}
