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
        float gray = (color.r + color.g + color.b) / 3.0;
        vec3 grayscale = vec3(gray);
        // grayscale.r = 1.0;

        gl_FragColor = vec4(grayscale, 1.0);
}