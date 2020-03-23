#ifdef GL_ES
precision mediump float;
#endif

varying vec4 v_color;
varying vec2 v_texCoords;
uniform sampler2D u_texture;
uniform mat4 u_projTrans;

void main()
{
    vec2 uv = v_texCoords;
    // flip image along y
    // uv.y = 1.0 - uv.y;
    vec3 color = texture2D(u_texture, uv).rgb;

    gl_FragColor = vec4(color, 0.25);
}