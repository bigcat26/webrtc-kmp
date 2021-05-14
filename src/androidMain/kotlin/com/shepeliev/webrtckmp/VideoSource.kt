package com.shepeliev.webrtckmp

import org.webrtc.VideoSource as NativeVideoSource

actual class VideoSource internal constructor(
    override val native: NativeVideoSource,
) : BaseMediaSource(), MediaSource {

    actual override val state: MediaSource.State
        get() = super.state

    actual fun adaptOutputFormat(width: Int, height: Int, fps: Int) {
        native.adaptOutputFormat(width, height, fps)
    }

    actual fun dispose() = native.dispose()
}
