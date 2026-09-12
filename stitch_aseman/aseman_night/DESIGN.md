---
version: alpha
name: Aseman Night
colors:
  primary: '#8A5CF6'
  secondary: '#FF6FA8'
  tertiary: '#FFC93C'
  neutral: '#121620'
  surface: '#1B2130'
  on-surface: '#F5F3FF'
  error: '#FF6B6B'
  surface-dim: '#0f131d'
  surface-bright: '#353944'
  surface-container-lowest: '#0a0e18'
  surface-container-low: '#171b26'
  surface-container: '#1b1f2a'
  surface-container-high: '#262a34'
  surface-container-highest: '#313540'
  on-surface-variant: '#cbc3d7'
  inverse-surface: '#dfe2f0'
  inverse-on-surface: '#2c303b'
  outline: '#958ea0'
  outline-variant: '#494454'
  surface-tint: '#d0bcff'
  on-primary: '#3b0091'
  primary-container: '#9f78ff'
  on-primary-container: '#330080'
  inverse-primary: '#6d3bd7'
  on-secondary: '#640035'
  secondary-container: '#8d104f'
  on-secondary-container: '#ff9abd'
  on-tertiary: '#3f2e00'
  tertiary-container: '#b68a00'
  on-tertiary-container: '#372700'
  on-error: '#690005'
  error-container: '#93000a'
  on-error-container: '#ffdad6'
  primary-fixed: '#e9ddff'
  primary-fixed-dim: '#d0bcff'
  on-primary-fixed: '#23005c'
  on-primary-fixed-variant: '#5417bf'
  secondary-fixed: '#ffd9e3'
  secondary-fixed-dim: '#ffb0ca'
  on-secondary-fixed: '#3e001f'
  on-secondary-fixed-variant: '#8a0d4d'
  tertiary-fixed: '#ffdf9a'
  tertiary-fixed-dim: '#f4bf32'
  on-tertiary-fixed: '#251a00'
  on-tertiary-fixed-variant: '#5a4300'
  background: '#0f131d'
  on-background: '#dfe2f0'
  surface-variant: '#313540'
typography:
  h1-temp:
    fontFamily: Peyda
    fontSize: 64px
    fontWeight: 700
    lineHeight: 1.0
  h2:
    fontFamily: Peyda
    fontSize: 28px
    fontWeight: 600
    lineHeight: 1.2
  body-lg:
    fontFamily: Peyda
    fontSize: 18px
    fontWeight: 400
    lineHeight: 1.5
  body-md:
    fontFamily: Peyda
    fontSize: 16px
    fontWeight: 400
    lineHeight: 1.5
  label-md:
    fontFamily: Peyda
    fontSize: 13px
    fontWeight: 500
    lineHeight: 1.3
    letterSpacing: 0.01em
  display-hero:
    fontFamily: Plus Jakarta Sans
    fontSize: 64px
    fontWeight: '700'
    lineHeight: '1.0'
    letterSpacing: -0.03em
  display-hero-mobile:
    fontFamily: Plus Jakarta Sans
    fontSize: 48px
    fontWeight: '700'
    lineHeight: '1.0'
    letterSpacing: -0.02em
  headline-lg:
    fontFamily: Plus Jakarta Sans
    fontSize: 28px
    fontWeight: '600'
    lineHeight: '1.2'
    letterSpacing: -0.02em
  label-sm:
    fontFamily: Plus Jakarta Sans
    fontSize: 11px
    fontWeight: '600'
    lineHeight: '1.2'
    letterSpacing: 0.02em
rounded:
  sm: 12px
  md: 20px
  lg: 28px
  full: 9999px
  DEFAULT: 1rem
  xl: 3rem
spacing:
  xs: 4px
  sm: 8px
  md: 16px
  lg: 24px
  xl: 32px
  margin: 16px
  gutter: 16px
components:
  button-primary:
    backgroundColor: '{colors.primary}'
    textColor: '{colors.on-surface}'
    rounded: '{rounded.full}'
    padding: 14px
  card-weather-hero:
    backgroundColor: '{colors.primary}'
    textColor: '{colors.on-surface}'
    rounded: '{rounded.lg}'
    padding: 24px
  card-stat:
    backgroundColor: '{colors.surface}'
    textColor: '{colors.on-surface}'
    rounded: '{rounded.md}'
    padding: 16px
  nav-bar-floating:
    backgroundColor: '{colors.surface}'
    textColor: '{colors.on-surface}'
    rounded: '{rounded.full}'
    padding: 12px
  modal-sheet:
    backgroundColor: '{colors.surface}'
    textColor: '{colors.on-surface}'
    rounded: '{rounded.lg}'
    padding: 20px
---

# Design System — آسمان (نسخه شب)

## Overview
نسخه‌ی شب «آسمان» بر پایه‌ی زمینه‌ی تیره‌ی نزدیک به مشکی (#121620) و کارت‌های گرادیانیِ بنفش-صورتی-طلایی است. حس‌وحال: آرام، شیک، پرکنتراست، با زبان بصری آیکون‌های سه‌بعدی نرم و شیشه‌ای (Soft 3D Glassy) نسخه‌ی روز با نورپردازی سرد و درخشان شبانه.