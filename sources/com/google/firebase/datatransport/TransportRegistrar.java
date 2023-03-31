package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p084l1.C4907g;
import p302n7.C11934c;
import p302n7.C11966r;
import p329q7.C12191a;
import p367u8.C12707h;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<C11934c<?>> getComponents() {
        return Arrays.asList(new C11934c[]{C11934c.m57617c(C4907g.class).mo36261h(LIBRARY_NAME).mo36256b(C11966r.m57744j(Context.class)).mo36260f(C12191a.f45275a).mo36258d(), C12707h.m60249b(LIBRARY_NAME, "18.1.7")});
    }
}
