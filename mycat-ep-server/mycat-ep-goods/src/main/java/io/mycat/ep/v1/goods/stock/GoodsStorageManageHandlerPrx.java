// **********************************************************************
//
// Copyright (c) 2003-2015 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.0
//
// <auto-generated>
//
// Generated from file `goods.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package io.mycat.ep.v1.goods.stock;

public interface GoodsStorageManageHandlerPrx extends Ice.ObjectPrx
{
    public StorageAmount queryGoodsAmount(StorageQuery query);

    public StorageAmount queryGoodsAmount(StorageQuery query, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_queryGoodsAmount(StorageQuery query);

    public Ice.AsyncResult begin_queryGoodsAmount(StorageQuery query, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_queryGoodsAmount(StorageQuery query, Ice.Callback __cb);

    public Ice.AsyncResult begin_queryGoodsAmount(StorageQuery query, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_queryGoodsAmount(StorageQuery query, Callback_GoodsStorageManageHandler_queryGoodsAmount __cb);

    public Ice.AsyncResult begin_queryGoodsAmount(StorageQuery query, java.util.Map<String, String> __ctx, Callback_GoodsStorageManageHandler_queryGoodsAmount __cb);

    public Ice.AsyncResult begin_queryGoodsAmount(StorageQuery query, 
                                                  IceInternal.Functional_GenericCallback1<StorageAmount> __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_queryGoodsAmount(StorageQuery query, 
                                                  IceInternal.Functional_GenericCallback1<StorageAmount> __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                  IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_queryGoodsAmount(StorageQuery query, 
                                                  java.util.Map<String, String> __ctx, 
                                                  IceInternal.Functional_GenericCallback1<StorageAmount> __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_queryGoodsAmount(StorageQuery query, 
                                                  java.util.Map<String, String> __ctx, 
                                                  IceInternal.Functional_GenericCallback1<StorageAmount> __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                  IceInternal.Functional_BoolCallback __sentCb);

    public StorageAmount end_queryGoodsAmount(Ice.AsyncResult __result);

    public StorageChangeResult changeStorage(StorageChange change);

    public StorageChangeResult changeStorage(StorageChange change, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_changeStorage(StorageChange change);

    public Ice.AsyncResult begin_changeStorage(StorageChange change, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_changeStorage(StorageChange change, Ice.Callback __cb);

    public Ice.AsyncResult begin_changeStorage(StorageChange change, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_changeStorage(StorageChange change, Callback_GoodsStorageManageHandler_changeStorage __cb);

    public Ice.AsyncResult begin_changeStorage(StorageChange change, java.util.Map<String, String> __ctx, Callback_GoodsStorageManageHandler_changeStorage __cb);

    public Ice.AsyncResult begin_changeStorage(StorageChange change, 
                                               IceInternal.Functional_GenericCallback1<StorageChangeResult> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_changeStorage(StorageChange change, 
                                               IceInternal.Functional_GenericCallback1<StorageChangeResult> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                               IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_changeStorage(StorageChange change, 
                                               java.util.Map<String, String> __ctx, 
                                               IceInternal.Functional_GenericCallback1<StorageChangeResult> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_changeStorage(StorageChange change, 
                                               java.util.Map<String, String> __ctx, 
                                               IceInternal.Functional_GenericCallback1<StorageChangeResult> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                               IceInternal.Functional_BoolCallback __sentCb);

    public StorageChangeResult end_changeStorage(Ice.AsyncResult __result);

    public StorageChangeResult changeStorageBatch(StorageChange[] change);

    public StorageChangeResult changeStorageBatch(StorageChange[] change, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_changeStorageBatch(StorageChange[] change);

    public Ice.AsyncResult begin_changeStorageBatch(StorageChange[] change, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_changeStorageBatch(StorageChange[] change, Ice.Callback __cb);

    public Ice.AsyncResult begin_changeStorageBatch(StorageChange[] change, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_changeStorageBatch(StorageChange[] change, Callback_GoodsStorageManageHandler_changeStorageBatch __cb);

    public Ice.AsyncResult begin_changeStorageBatch(StorageChange[] change, java.util.Map<String, String> __ctx, Callback_GoodsStorageManageHandler_changeStorageBatch __cb);

    public Ice.AsyncResult begin_changeStorageBatch(StorageChange[] change, 
                                                    IceInternal.Functional_GenericCallback1<StorageChangeResult> __responseCb, 
                                                    IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_changeStorageBatch(StorageChange[] change, 
                                                    IceInternal.Functional_GenericCallback1<StorageChangeResult> __responseCb, 
                                                    IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                    IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_changeStorageBatch(StorageChange[] change, 
                                                    java.util.Map<String, String> __ctx, 
                                                    IceInternal.Functional_GenericCallback1<StorageChangeResult> __responseCb, 
                                                    IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_changeStorageBatch(StorageChange[] change, 
                                                    java.util.Map<String, String> __ctx, 
                                                    IceInternal.Functional_GenericCallback1<StorageChangeResult> __responseCb, 
                                                    IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                    IceInternal.Functional_BoolCallback __sentCb);

    public StorageChangeResult end_changeStorageBatch(Ice.AsyncResult __result);
}