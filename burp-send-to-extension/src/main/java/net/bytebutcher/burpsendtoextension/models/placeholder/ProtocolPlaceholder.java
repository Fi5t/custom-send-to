package net.bytebutcher.burpsendtoextension.models.placeholder;

import burp.IContextMenuInvocation;
import burp.RequestResponseHolder;

import javax.annotation.Nullable;

public class ProtocolPlaceholder extends AbstractPlaceholder {

    public ProtocolPlaceholder(RequestResponseHolder requestResponseHolder, IContextMenuInvocation iContextMenuInvocation) {
        super("%T", false, false, requestResponseHolder, iContextMenuInvocation);
    }

    @Nullable
    @Override
    protected String getInternalValue() {
        return getRequestResponseHolder().getHttpRequestResponse().getHttpService().getProtocol();
    }
}
