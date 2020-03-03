fun handleResult(result: Result) {
    when (result) {
        is Result.InternetError -> {
            print("WIFi yoki Internetni ulang!")
        }
        is Result.ServerError -> {
            print("Xatoli kodi =" + result.code)
        }

        is Result.QueryError -> {
            print("Xatolik xabari " + result.message)
        }

        is Result.Data -> {
            adapter.submitList(result.list)
        }
    }
}
