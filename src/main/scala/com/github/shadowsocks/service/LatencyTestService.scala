package com.github.shadowsocks.service

import android.app.Service
import android.content.Intent
import android.os.IBinder

class LatencyTestService extends Service {
  override def onBind(intent: Intent): IBinder = null

  override def onStartCommand(intent: Intent, flags: Int, startId: Int): Int = {
    return Service.START_NOT_STICKY
  }
}
