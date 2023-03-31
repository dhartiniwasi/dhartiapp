package com.startapp;

import android.content.Context;
import android.os.Bundle;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.C9529b;

/* renamed from: com.startapp.jb */
/* compiled from: Sta */
public class C9051jb extends C9529b {
    public C9051jb(Context context, C9529b.C9530a aVar, Bundle bundle) {
        super(context, aVar, bundle);
    }

    public void run() {
        C9090kb a = ComponentLocator.m50248a(this.context).f39044l.mo29904a();
        C9529b.C9530a aVar = this.callback;
        if (aVar != null) {
            a.f37197e.post(new C9118lb(a, aVar, this));
        } else {
            a.f37197e.post(a.f37202j);
        }
    }
}
