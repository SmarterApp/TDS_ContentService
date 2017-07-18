/***************************************************************************************************
 * Copyright 2017 Regents of the University of California. Licensed under the Educational
 * Community License, Version 2.0 (the “license”); you may not use this file except in
 * compliance with the License. You may obtain a copy of the license at
 *
 * https://opensource.org/licenses/ECL-2.0
 *
 * Unless required under applicable law or agreed to in writing, software distributed under the
 * License is distributed in an “AS IS” BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for specific language governing permissions
 * and limitations under the license.
 **************************************************************************************************/

package tds.content.services;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import tds.itemrenderer.data.AccLookup;
import tds.itemrenderer.data.ITSDocument;

/**
 * Handles loading the Item Documents for display
 */
public interface ContentService {
    /**
     * Loads the {@link tds.itemrenderer.data.IITSDocument} representing item document
     *
     * @param uri            the URI to the document
     * @param accommodations the {@link tds.itemrenderer.data.AccLookup} associated with the document
     * @return {@link tds.itemrenderer.data.IITSDocument}
     */
    ITSDocument loadItemDocument(final URI uri, final AccLookup accommodations, final String contextPath);

    /**
     * Loads the resource at the specified path
     *
     * @param resourcePath The path of the resource
     * @return An {@link java.io.InputStream} of the resource data
     */
    InputStream loadResource(final URI resourcePath) throws IOException;
}