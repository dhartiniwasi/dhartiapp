package com.pichillilorenzo.flutter_inappwebview.types;

import android.view.View;
import java.util.HashMap;
import p264io.flutter.plugin.platform.C10731f;

public interface PlatformWebView extends C10731f {
    /* synthetic */ void dispose();

    /* synthetic */ View getView();

    void makeInitialLoad(HashMap<String, Object> hashMap);

    /* bridge */ /* synthetic */ void onFlutterViewAttached(View view);

    /* bridge */ /* synthetic */ void onFlutterViewDetached();

    /* bridge */ /* synthetic */ void onInputConnectionLocked();

    /* bridge */ /* synthetic */ void onInputConnectionUnlocked();
}
