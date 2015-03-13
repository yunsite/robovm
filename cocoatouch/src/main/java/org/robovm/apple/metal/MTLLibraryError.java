/*
 * Copyright (C) 2013-2015 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.metal;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Metal")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLLibraryError/*</name>*/ 
    extends /*<extends>*/NSError/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    protected MTLLibraryError(SkipInit skipInit) {
        super(skipInit);
    }
    
    /*<ptr>*/public static class MTLLibraryErrorPtr extends Ptr<MTLLibraryError, MTLLibraryErrorPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(MTLLibraryError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    @Override
    public MTLLibraryErrorCode getErrorCode() {
        MTLLibraryErrorCode code = null;
        try {
            code = MTLLibraryErrorCode.valueOf(getCode());
        } catch (IllegalArgumentException e) {
            // ignore
        }
        return code;
    }
    /*<methods>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalValue(symbol="MTLLibraryErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/
}
