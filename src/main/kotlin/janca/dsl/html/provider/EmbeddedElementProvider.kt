package janca.dsl.html.provider

import janca.dsl.html.element.impl.embed.AppletElementProvider
import janca.dsl.html.element.impl.embed.AreaElementProvider
import janca.dsl.html.element.impl.embed.AudioElementProvider
import janca.dsl.html.element.impl.embed.CanvasElementProvider
import janca.dsl.html.element.impl.embed.EmbedElementProvider
import janca.dsl.html.element.impl.embed.FigureElementProvider
import janca.dsl.html.element.impl.embed.FrameElementProvider
import janca.dsl.html.element.impl.embed.FrameSetElementProvider
import janca.dsl.html.element.impl.embed.IFrameElementProvider
import janca.dsl.html.element.impl.embed.ImageElementProvider
import janca.dsl.html.element.impl.embed.MapElementProvider
import janca.dsl.html.element.impl.embed.NoFramesElementProvider
import janca.dsl.html.element.impl.embed.ObjectElementProvider
import janca.dsl.html.element.impl.embed.ParameterElementProvider
import janca.dsl.html.element.impl.embed.SourceElementProvider
import janca.dsl.html.element.impl.embed.SvgElementProvider
import janca.dsl.html.element.impl.embed.TimeElementProvider
import janca.dsl.html.element.impl.embed.VideoElementProvider

interface EmbeddedElementProvider :
    AppletElementProvider,
    AreaElementProvider,
    AudioElementProvider,
    CanvasElementProvider,
    EmbedElementProvider,
    FigureElementProvider,
    FrameElementProvider,
    FrameSetElementProvider,
    IFrameElementProvider,
    ImageElementProvider,
    MapElementProvider,
    NoFramesElementProvider,
    ObjectElementProvider,
    ParameterElementProvider,
    SourceElementProvider,
    SvgElementProvider,
    TimeElementProvider,
    VideoElementProvider