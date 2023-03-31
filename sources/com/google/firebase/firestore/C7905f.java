package com.google.firebase.firestore;

import p008a8.C6452b1;
import p211d8.C9903u;

/* renamed from: com.google.firebase.firestore.f */
/* compiled from: CollectionReference */
public class C7905f extends C7929o0 {
    C7905f(C9903u uVar, FirebaseFirestore firebaseFirestore) {
        super(C6452b1.m37619b(uVar), firebaseFirestore);
        if (uVar.mo32358r() % 2 != 1) {
            throw new IllegalArgumentException("Invalid collection reference. Collection references must have an odd number of segments, but " + uVar.mo32348c() + " has " + uVar.mo32358r());
        }
    }
}
