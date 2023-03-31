package com.startapp;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Pair;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.startapp.t8 */
/* compiled from: Sta */
public class C9555t8 extends C9621w8 {

    /* renamed from: c */
    public BroadcastReceiver f39191c;

    /* renamed from: com.startapp.t8$a */
    /* compiled from: Sta */
    public class C9556a extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ C9661y8 f39192a;

        public C9556a(C9661y8 y8Var) {
            this.f39192a = y8Var;
        }

        public void onReceive(Context context, Intent intent) {
            this.f39192a.mo31493a((Object) new Pair(C9555t8.this, intent));
        }
    }

    public C9555t8(String str, Map<String, String> map) {
        super(str, map);
    }

    /* renamed from: a */
    public void mo29234a(Context context, C9661y8 y8Var) throws Exception {
        if (this.f39191c == null) {
            C9556a aVar = new C9556a(y8Var);
            this.f39191c = aVar;
            context.registerReceiver(aVar, new IntentFilter(this.f39330a));
            return;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9555t8.class != obj.getClass()) {
            return false;
        }
        return C9605vb.m50465a(this.f39191c, ((C9555t8) obj).f39191c);
    }

    public int hashCode() {
        Object[] objArr = {this.f39191c};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: a */
    public void mo29233a(Context context) throws Exception {
        BroadcastReceiver broadcastReceiver = this.f39191c;
        if (broadcastReceiver != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.f39191c = null;
            return;
        }
        throw new IllegalStateException();
    }
}
