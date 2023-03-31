package com.startapp;

import android.os.AsyncTask;

/* renamed from: com.startapp.ee */
/* compiled from: Sta */
public abstract class C8935ee extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    public C8936a f36740a;

    /* renamed from: b */
    public final C8937b f36741b;

    /* renamed from: com.startapp.ee$a */
    /* compiled from: Sta */
    public interface C8936a {
    }

    /* renamed from: com.startapp.ee$b */
    /* compiled from: Sta */
    public interface C8937b {
    }

    public C8935ee(C8937b bVar) {
        this.f36741b = bVar;
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        C8936a aVar = this.f36740a;
        if (aVar != null) {
            C9100ke keVar = (C9100ke) aVar;
            keVar.f37232c = null;
            C8935ee poll = keVar.f37231b.poll();
            keVar.f37232c = poll;
            if (poll != null) {
                poll.executeOnExecutor(keVar.f37230a, new Object[0]);
            }
        }
    }
}
