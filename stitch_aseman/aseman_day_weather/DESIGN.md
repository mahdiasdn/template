---
name: Aseman Day Weather
colors:
  surface: '#fcf9f3'
  surface-dim: '#dcdad4'
  surface-bright: '#fcf9f3'
  surface-container-lowest: '#ffffff'
  surface-container-low: '#f6f3ed'
  surface-container: '#f0eee8'
  surface-container-high: '#ebe8e2'
  surface-container-highest: '#e5e2dc'
  on-surface: '#1E2A3A'
  on-surface-variant: '#414754'
  inverse-surface: '#31312d'
  inverse-on-surface: '#f3f0eb'
  outline: '#717785'
  outline-variant: '#c1c6d6'
  surface-tint: '#005cbb'
  primary: '#005ab7'
  on-primary: '#ffffff'
  primary-container: '#0072e5'
  on-primary-container: '#fefcff'
  inverse-primary: '#abc7ff'
  secondary: '#3f6089'
  on-secondary: '#ffffff'
  secondary-container: '#b0d1ff'
  on-secondary-container: '#385a82'
  tertiary: '#a53700'
  on-tertiary: '#ffffff'
  tertiary-container: '#c84d18'
  on-tertiary-container: '#fffbff'
  error: '#ba1a1a'
  on-error: '#ffffff'
  error-container: '#ffdad6'
  on-error-container: '#93000a'
  primary-fixed: '#d7e2ff'
  primary-fixed-dim: '#abc7ff'
  on-primary-fixed: '#001b3f'
  on-primary-fixed-variant: '#00458f'
  secondary-fixed: '#d2e4ff'
  secondary-fixed-dim: '#a8c9f7'
  on-secondary-fixed: '#001c37'
  on-secondary-fixed-variant: '#25486f'
  tertiary-fixed: '#ffdbcf'
  tertiary-fixed-dim: '#ffb59b'
  on-tertiary-fixed: '#380d00'
  on-tertiary-fixed-variant: '#812900'
  background: '#fcf9f3'
  on-background: '#1c1c18'
  surface-variant: '#e5e2dc'
  surface-card: '#FFFFFF'
  surface-cream: '#FFFCF6'
  sky-tint-bg: '#EBF3FF'
  error-red: '#E5484D'
  sun-glow: '#FFB800'
  glass-border: rgba(255, 255, 255, 0.45)
  shadow-tint: rgba(51, 137, 255, 0.16)
typography:
  temp-hero:
    fontFamily: Peyda
    fontSize: 64px
    fontWeight: '700'
    lineHeight: '1.0'
    letterSpacing: -0.02em
  temp-hero-mobile:
    fontFamily: Peyda
    fontSize: 56px
    fontWeight: '700'
    lineHeight: '1.0'
    letterSpacing: -0.02em
  h1:
    fontFamily: Peyda
    fontSize: 32px
    fontWeight: '700'
    lineHeight: '1.2'
  h2:
    fontFamily: Peyda
    fontSize: 24px
    fontWeight: '600'
    lineHeight: '1.3'
  h3:
    fontFamily: Peyda
    fontSize: 20px
    fontWeight: '600'
    lineHeight: '1.35'
  body-lg:
    fontFamily: Peyda
    fontSize: 18px
    fontWeight: '400'
    lineHeight: '1.6'
  body-md:
    fontFamily: Peyda
    fontSize: 16px
    fontWeight: '400'
    lineHeight: '1.5'
  body-sm:
    fontFamily: Peyda
    fontSize: 14px
    fontWeight: '400'
    lineHeight: '1.5'
  stat-value:
    fontFamily: Peyda
    fontSize: 22px
    fontWeight: '600'
    lineHeight: '1.1'
  label-md:
    fontFamily: Peyda
    fontSize: 13px
    fontWeight: '500'
    lineHeight: '1.3'
  label-sm:
    fontFamily: Peyda
    fontSize: 11px
    fontWeight: '500'
    lineHeight: '1.2'
rounded:
  sm: 0.25rem
  DEFAULT: 0.5rem
  md: 0.75rem
  lg: 1rem
  xl: 1.5rem
  full: 9999px
spacing:
  space-2xs: 4px
  space-xs: 8px
  space-sm: 12px
  space-md: 16px
  space-lg: 20px
  space-xl: 24px
  space-2xl: 32px
  space-3xl: 48px
  screen-margin: 16px
  card-gap: 16px
---

## Brand & Style

This design system embodies a serene, optimistic, and welcoming day-atmosphere tailored for Persian (Farsi) speakers. Rooted in tactile glassmorphism and soft neumorphism, the system balances hyper-legible weather telemetry with warm, frosted visual anchors. 

### Core Characteristics
- **Personality:** Optimistic, clear, gentle, reliable, and deeply localized.
- **Visual Language:** Tactile 3D frosted glass weather entities coupled with luminous daylight gradients. Rather than flat minimal glyphs or generic landscape vector silhouettes, depth is communicated through soft, frosted cloud volumes, radiant sun spheres, and luminous, sky-tinted ambient glows.
- **Localization & Cultural Adaptation:** Built natively for Right-to-Left (RTL) reading flow, using Persian numerals (۰۱۲۳۴۵۶۷۸۹) and the Solar Hijri calendar. Directional visual logic (such as back-actions, directional carousels, and time progressions) is fully mirrored to honor natural Persian reading mechanics.

## Colors

The color palette translates a bright, sunlit Mediterranean/Middle-Eastern sky into functional UI tokens:

- **Primary (`#3389FF`):** Sky blue. Serves as the primary brand beacon, anchoring the main hero weather stage, primary calls-to-action, and active navigation indicators.
- **Secondary (`#4A6B94`):** Slate blue. Formulated for supporting typography, passive iconography, non-active tabs, and metric descriptors.
- **Tertiary (`#FF753E`):** Warm sunlit orange. Reserved for high-priority insights, UV index peaks, high-temperature indicators, and dynamic "Smart Tip" banners.
- **Neutral (`#FFFCF6`):** Warm cream-white. Provides an organic, paper-soft canvas that reduces digital glare under daylight use, contrasting gently with pure white floating cards.
- **On-Surface (`#1E2A3A`):** Deep navy. Replaces stark carbon black with a rich, atmospheric dark tone that retains high contrast while staying harmonized with blue hues.
- **Error (`#E5484D`):** Vivid crimson for critical storm advisories and air quality hazards.

### Usage Guidance
Avoid mixing multiple saturated accent colors simultaneously. Let the hero sky-blue establish the primary mood; apply warm tertiary orange sparingly as an informational highlight.

## Typography

The typography system is built exclusively with **Peyda**, a contemporary Persian typeface optimized for on-screen legibility and geometric balance.

### Typographic Rules & RTL Discipline
- **Native Persian Digits:** All numbers—including temperature degrees (°), wind speeds (کیلومتر/ساعت), atmospheric humidity (٪), and Solar Hijri dates—must be rendered in standard Persian glyph sets (۰۱۲۳۴۵۶۷۸۹).
- **Hero Temperature Priority:** The `temp-hero` scale creates immediate hierarchy at the top fold of the interface.
- **Absence of Letter Spacing and Casing:** Persian typography lacks letter casing (no uppercase/lowercase). Hierarchy is driven strictly by optical weights (Medium `500`, SemiBold `600`, Bold `700`) and comfortable Persian-specific line heights (1.5–1.6) that avoid clipping Persian ascenders and descenders (e.g., ژ, گ, چ).

## Layout & Spacing

The layout operates on a standard 8px incremental scale, tailored for single-hand mobile weather monitoring and fluid tablet surfaces.

### Layout Philosophy
- **RTL Screen Structure:** The user reads right-to-left. Primary anchors (city names, day labels) start from the right edge, while values or action icons resolve on the left.
- **Vertical Hierarchy:**
  1. **Top Bar:** City title, date, and contextual utility icons.
  2. **Weather Hero Card:** Prominent visual stage housing the 3D glassy sun/cloud, massive temperature indicator, weather condition text, and key micro-stats.
  3. **Smart Tip Banner:** Tertiary orange alert or clothing recommendation.
  4. **Telemetry Metric Grid:** 2-column or 3-column modular cards (Humidity, UV, Wind, Visibility, Pressure).
  5. **Hourly Horizontal Scroller:** Fluid swipeable rail with Persian hour labels.
  6. **Daily Forecast List:** Vertical stack showing next 7 days.
  7. **Floating Dock:** Bottom floating tab navigation anchored above the system gesture area.
- **Margins & Gutters:** Fixed 16px screen padding on mobile (`< 480px`), scaling to 24px on tablet/desktop containers with a max-width of 460px for phone emulation or 680px for expanded views.

## Elevation & Depth

Visual depth is achieved through **soft tinted ambient illumination** and frosted glassmorphism, completely avoiding dull grayscale drop shadows.

### Atmospheric Shadow Levels
- **Hero Sky Card Elevation:** `box-shadow: 0 16px 36px -8px rgba(51, 137, 255, 0.28), 0 4px 12px -2px rgba(51, 137, 255, 0.12)`. This mimics the radiant glow of a lit sky.
- **Floating Island Dock:** `box-shadow: 0 12px 28px -6px rgba(30, 42, 58, 0.08), 0 2px 8px 0 rgba(30, 42, 58, 0.03)`. Subtle, clean daylight detachment.
- **Frosted Glass (Glassmorphism):** Internal glass layers use `backdrop-filter: blur(16px)`, `background: rgba(255, 255, 255, 0.35)`, and a fine top border `1px solid rgba(255, 255, 255, 0.55)` simulating light refraction on edge glass.
- **Metric Cards:** Subdued flat cream `#FFFFFF` over `#FFFCF6` with an ultra-soft ambient shadow (`0 4px 16px rgba(30, 42, 58, 0.04)`) to maintain clean scannability.

## Shapes

The interface embraces organic, smooth rounded forms that match the fluid curves of the frosted cloud and sun logo icon.

- **Small elements (`sm: 12px`):** Metric sub-tags, badge pills, segmented weather indicators.
- **Cards & Sheets (`md: 20px` to `lg: 28px`):** Main metric grid tiles utilize `20px`; the primary hero weather viewport and bottom sheets use `28px`.
- **Pills (`full: 9999px`):** Used on primary interactive buttons, search bars, and the floating bottom navigation bar to provide friendly, tactile ergonomics.

## Components

### 1. Weather Hero Card
- **Background:** High-saturation primary sky blue (`#3389FF`) or a subtle daylight vertical gradient (`#4294FF` to `#267CEE`).
- **Content:** Large soft 3D frosted cloud and glowing sun icon floating at the optical center/top-left; gigantic `temp-hero` value (e.g., ۳۲°) placed with condition text («آفتابی») and city name.
- **Bottom Metrics Rail:** 3-column micro data (باد، رطوبت، بارش) with light translucent divider borders (`rgba(255, 255, 255, 0.25)`).

### 2. Buttons
- **Primary:** Background `#3389FF`, text `#FFFCF6`, border-radius `full` (9999px), padding `14px 24px`. High tactile elevation glow on press.
- **Secondary / Ghost:** Translucent slate blue tint (`rgba(74, 107, 148, 0.1)`), text `#4A6B94`, border-radius `full`.

### 3. Metric Stat Cards
- **Structure:** Crisp surface container (`#FFFFFF`) on `#FFFCF6` canvas, border-radius `20px`, padding `16px`.
- **Layout (RTL):** Small 3D tactile glass icon right-aligned; stat label in `label-md` (`#4A6B94`); numeric readout in `stat-value` (`#1E2A3A`) with Persian unit suffixes.

### 4. Floating Island Navigation Dock
- **Form:** Fully rounded pill container suspended 20px above bottom screen margin.
- **Appearance:** Ultra-bright frosted surface (`rgba(255, 252, 246, 0.9)` with 20px blur).
- **Interaction:** 3 primary segments (امروز [Today], شهرها [Cities], تنظیمات [Settings]). Active item indicated by a solid `#3389FF` pill highlight or glowing active icon.

### 5. Smart Tip Banner (نکته هوشمند)
- **Background:** Warm tint (`rgba(255, 117, 62, 0.12)`), solid tertiary border accent on the right (`3px solid #FF753E`), border-radius `16px`.
- **Iconography:** Warm 3D sun or umbrella badge accompanied by crisp contextual Persian advice.

### 6. Modal Bottom Sheet
- **Behavior:** Slides from bottom edge on mobile, handles drag interactions via a centered pill handle (`#4A6B94` at 20% opacity).
- **Corner Radius:** `28px 28px 0 0`.