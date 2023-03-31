package com.startapp;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.startapp.td */
/* compiled from: Sta */
public class C9569td {

    /* renamed from: a */
    public final HashMap<View, String> f39216a = new HashMap<>();

    /* renamed from: b */
    public final HashMap<View, C9570a> f39217b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, View> f39218c = new HashMap<>();

    /* renamed from: d */
    public final HashSet<View> f39219d = new HashSet<>();

    /* renamed from: e */
    public final HashSet<String> f39220e = new HashSet<>();

    /* renamed from: f */
    public final HashSet<String> f39221f = new HashSet<>();

    /* renamed from: g */
    public final HashMap<String, String> f39222g = new HashMap<>();

    /* renamed from: h */
    public final Map<View, Boolean> f39223h = new WeakHashMap();

    /* renamed from: i */
    public boolean f39224i;

    /* renamed from: com.startapp.td$a */
    /* compiled from: Sta */
    public static class C9570a {

        /* renamed from: a */
        public final C9017he f39225a;

        /* renamed from: b */
        public final ArrayList<String> f39226b = new ArrayList<>();

        public C9570a(C9017he heVar, String str) {
            this.f39225a = heVar;
            mo31300a(str);
        }

        /* renamed from: a */
        public void mo31300a(String str) {
            this.f39226b.add(str);
        }
    }
}
