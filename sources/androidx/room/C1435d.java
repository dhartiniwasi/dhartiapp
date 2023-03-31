package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: androidx.room.d */
/* compiled from: InvalidationLiveDataContainer */
class C1435d {

    /* renamed from: a */
    final Set<LiveData> f4084a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: b */
    private final C1450h f4085b;

    C1435d(C1450h hVar) {
        this.f4085b = hVar;
    }
}
