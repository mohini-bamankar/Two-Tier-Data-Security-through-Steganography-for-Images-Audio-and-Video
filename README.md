🔐 Two-Tier Data Security through Steganography for Images, Audio, and Video
📌 Overview

This project presents a Two-Tier Data Security Framework that ensures secure data transmission using Steganography combined with a Genetic Algorithm (GA). The system hides confidential information inside multimedia content such as images and videos, making the data invisible to unauthorized users.

With the increasing risk of data theft and cyber attacks, this approach enhances security by introducing an additional intelligent layer for frame selection before embedding the secret data.

🎯 Objectives
To securely hide sensitive data within multimedia files
To prevent unauthorized access and data leakage
To improve robustness using a two-tier security mechanism
To minimize visual distortion in the output media
⚙️ System Architecture

The system works in two major tiers:

🔹 Tier 1: Frame Selection using Genetic Algorithm
Extract frames from the input video
Apply Genetic Algorithm to select optimal frames
Ensures randomness and enhances security
🔹 Tier 2: LSB Steganography
Convert image and text into byte format
Apply Least Significant Bit (LSB) labeling
Embed secret data into selected frames
Reconstruct frames into final video

🔄 Workflow
Input Video is provided
Frames are extracted from the video
Genetic Algorithm selects optimal frames
Input Image is converted into byte format
Secret Text is converted into byte array
LSB labeling identifies embedding positions
Steganography embeds secret data
Frames are unified
Final Stego Video is generated

🧠 Technologies Used
Python
OpenCV (for video and frame processing)
NumPy (for numerical operations)
Genetic Algorithm (for optimization)
LSB Steganography Technique

📊 Features
Two-layer security mechanism
High data hiding capacity
Minimal visual distortion
Resistant to basic steganalysis
Applicable to images, audio, and video

📈 Results
High accuracy in secure data embedding
Improved resistance against detection
Efficient frame selection using Genetic Algorithm

This project is licensed under the MIT License.

