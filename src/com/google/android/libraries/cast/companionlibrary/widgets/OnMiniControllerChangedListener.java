package com.google.android.libraries.cast.companionlibrary.widgets;

import android.content.Context;
import android.view.View;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.OnFailedListener;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;

/**
 * The interface for a listener that will be called when user interacts with the
 * {@link MiniController}, like clicking on the play/pause button, etc.
 */
public interface OnMiniControllerChangedListener extends OnFailedListener {

    /**
     * Notification that user has clicked on the Play/Pause button
     *
     * @throws TransientNetworkDisconnectionException
     * @throws NoConnectionException
     * @throws CastException
     */
    void onPlayPauseClicked(View v) throws CastException,
                                           TransientNetworkDisconnectionException, NoConnectionException;

    /**
     * Notification that the user has clicked on the album art
     *
     * @throws NoConnectionException
     * @throws TransientNetworkDisconnectionException
     */
    void onTargetActivityInvoked(Context context)
            throws TransientNetworkDisconnectionException, NoConnectionException;

    /**
     * Is called when the "play" button in the upcoming area is clicked.
     */
    void onUpcomingPlayClicked(View v, MediaQueueItem upcomingItem);

    /**
     * Is called when the "stop" button in the upcoming area is clicked.
     */
    void onUpcomingStopClicked(View view, MediaQueueItem upcomingItem);

}