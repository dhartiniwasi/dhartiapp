package p052g3;

import java.io.IOException;

/* renamed from: g3.r */
/* compiled from: SampleQueueMappingException */
public final class C4387r extends IOException {
    public C4387r(String str) {
        super("Unable to bind a sample queue to TrackGroup with mime type " + str + ".");
    }
}
