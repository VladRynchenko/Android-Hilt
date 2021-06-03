package com.example.android.hilt

import com.example.android.hilt.data.Log

interface LoggerDataSource {
    fun addLog(msg: String)
    fun getAllLogs(callback: (List<Log>) -> Unit)
    fun removeLogs()
}